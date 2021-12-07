package dao;

import base.BaseDao;
import dto.KullaniciYorumDetayDto;
import dto.YorumDetayDto;
import org.hibernate.query.Query;

import java.util.List;

public class YorumDao extends BaseDao {

    /**
     *
     * @param urunId
     * @return urune ait yorumları
     */
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

    /**
     *
     * @param kullaniciId
     * @return kullanıcı id ye ait yorumları
     */
    public List<KullaniciYorumDetayDto> getAllYorumBykullaniciId(Long kullaniciId){
        String sql = "select "+
                " new dto.KullaniciYorumDetayDto(kullanici.id,kullanici.adi,urun.adi,urunYorum.yorum,urunYorum.yorumTarihi) "+
                " from UrunYorum as urunYorum "+
                " left join Urun urun on urunYorum.urun.id=urun.id "+
                " left join Kullanici kullanici on urunYorum.Kullanici.id=kullanici.id "+
                " where kullanici.id=:sqlId";

        Query query=getCurrentSession().createQuery(sql);
        query.setParameter("sqlId", kullaniciId);
        return query.list();
    }


}
