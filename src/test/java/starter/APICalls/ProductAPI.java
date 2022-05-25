package starter.APICalls;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ProductAPI {
    String baseURL ="https://waarkoop-server.herokuapp.com/api/v1";

    @Step("{0} gets the details for {1}")
    public void getDetailsForProduct(String product) {
        String ProductUrl = baseURL+"/search/test/product";
        String finalURL = ProductUrl.replace("product",product);
        SerenityRest.given().get(finalURL);
    }

}
