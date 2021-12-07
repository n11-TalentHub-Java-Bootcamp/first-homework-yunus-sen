package dao;

import base.BaseDao;
import dto.YorumDetayDto;
import entity.Kategori;
import org.hibernate.query.Query;

import java.util.List;

public class YorumDao extends BaseDao {

    public List<YorumDetayDto> getAllYorumDetayByUrunId(Long urunId){
        String sql = "select " +
                " new dto.YorumDetayDto(u.adi,ka.adi,u.fiyat,ku.adi,ku.soyadi,ku.email,ku.telefon,uy.yorum,uy.yorumTarihi) " +
                " from UrunYorum as uy " +
                " left join Urun as u on uy.Kullanici.id = u.id " +
                " left join Kategori as ka on u.kategori.id = ka.id " +
                " left join Kullanici as ku on uy.Kullanici.id = ku.id where uy.urun.id = :sqlId ";

        Query query=getCurrentSession().createQuery(sql);
        query.setParameter("sqlId", urunId);
        return query.list();
    }
}
