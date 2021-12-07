package entityService;

import dao.YorumDao;
import dto.KullaniciYorumDetayDto;
import dto.YorumDetayDto;

import java.util.List;

public class UrunYorumEntityService {
    private YorumDao yorumDao;

    public UrunYorumEntityService() {
        yorumDao = new YorumDao();
    }

    public List<YorumDetayDto> getAllYorumDetayByUrunId(Long urunId){
        return yorumDao.getAllYorumDetayByUrunId(urunId);
    }
    public List<KullaniciYorumDetayDto> getAllYorumBykullaniciId(Long kullaniciId){
        return yorumDao.getAllYorumBykullaniciId(kullaniciId);
    }

}
