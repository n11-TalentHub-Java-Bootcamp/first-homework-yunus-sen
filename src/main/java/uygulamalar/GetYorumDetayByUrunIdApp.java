package uygulamalar;

import dto.YorumDetayDto;
import entityService.UrunYorumEntityService;

import java.util.List;

public class GetYorumDetayByUrunIdApp {
    public static void main(String[] args) {
        UrunYorumEntityService yorumService=new UrunYorumEntityService();
        List<YorumDetayDto> yorums=yorumService.getAllYorumDetayByUrunId(1L);
        yorums.forEach(item->System.out.println(item));
    }
}
