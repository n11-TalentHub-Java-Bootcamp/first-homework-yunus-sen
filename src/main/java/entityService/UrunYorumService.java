package entityService;

import dao.UrunDao;
import dao.YorumDao;
import dto.YorumDetayDto;
import entity.UrunYorum;

import java.util.List;

public class UrunYorumService {
    private YorumDao yorumDao;

    public UrunYorumService() {
        yorumDao = new YorumDao();
    }

    public List<YorumDetayDto> getAllYorumDetayByUrunId(Long urunId){
        return yorumDao.getAllYorumDetayByUrunId(urunId);
    }
}
