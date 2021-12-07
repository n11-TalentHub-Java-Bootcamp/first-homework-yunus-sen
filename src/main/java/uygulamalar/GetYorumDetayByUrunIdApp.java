package uygulamalar;

import dto.UrunDetayDto;
import dto.YorumDetayDto;
import entityService.UrunYorumService;

import java.util.List;

public class GetYorumDetayByUrunIdApp {
    public static void main(String[] args) {
        UrunYorumService yorumService=new UrunYorumService();
        List<YorumDetayDto> yorums=yorumService.getAllYorumDetayByUrunId(1L);
        yorums.forEach(item->System.out.println(item));
    }
}
