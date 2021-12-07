package uygulamalar;

import dto.UrunYorumCountDetayDto;
import entityService.UrunEntityService;

import java.util.List;

public class GetAllUrunWithYorumCountApp {
    public static void main(String[] args) {
        UrunEntityService service = new UrunEntityService();
        List<UrunYorumCountDetayDto> urunList = service.getAllUrunWithYorumCount();

        for (UrunYorumCountDetayDto urun : urunList) {
            System.out.println(urun);
        }
    }
}
