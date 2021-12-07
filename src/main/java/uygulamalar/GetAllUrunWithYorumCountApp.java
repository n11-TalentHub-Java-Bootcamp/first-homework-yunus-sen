package uygulamalar;

import dto.UrunYorumCountDetay;
import entity.Urun;
import entityService.UrunEntityService;

import java.util.List;

public class GetAllUrunWithYorumCountApp {
    public static void main(String[] args) {
        UrunEntityService service = new UrunEntityService();
        List<UrunYorumCountDetay> urunList = service.getAllUrunWithYorumCount();

        for (UrunYorumCountDetay urun : urunList) {
            System.out.println(urun);
        }
    }
}
