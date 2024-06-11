package com.morning.per;

import java.util.List;

import com.morning.domain.Product;
import com.morning.domain.ProductVO;

public interface ProductMapper {
	int getTotalCount();
	List<ProductVO> getProductList();
	List<ProductVO> getProductCateList(String cate);
	ProductVO getProduct(int pno);
	void insProduct(Product product);
	void upProduct(Product product);
	void delProduct(int pno);
}
