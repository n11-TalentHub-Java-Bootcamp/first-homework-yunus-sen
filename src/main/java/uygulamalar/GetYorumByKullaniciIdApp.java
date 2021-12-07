package uygulamalar;

import dto.KullaniciYorumDetayDto;
import entityService.UrunYorumEntityService;

import java.util.List;

public class GetYorumByKullaniciIdApp {
    public static void main(String[] args) {
        UrunYorumEntityService yorumService=new UrunYorumEntityService();
        List<KullaniciYorumDetayDto> yorums=yorumService.getAllYorumBykullaniciId(1L);
        yorums.forEach(item->System.out.println(item));
    }
}
