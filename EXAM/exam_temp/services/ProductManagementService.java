package EXAM.exam_temp.services;

import EXAM.exam_temp.enteties.Product;

public interface ProductManagementService {

	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
