package host.luke.FoodIntellectuals.biz.service;

import host.luke.FoodIntellectuals.common.entity.Canteen;
import java.util.List;

public interface CanteenService {

  List<Canteen> findAll(int page, int size);

}
