
import FactoryImp.highPriorityCreator;
import FactoryImp.lowPriorityCreator;
import FactoryImp.mediumPriorityCreator;
import FactoryPattern.RequestCreator;
import FactoryPattern.requestProduct;
import Models.Tenant;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Acer pv
 */
public class ClientMain {

    public static void main(String[] args) {
        RequestCreator low = new lowPriorityCreator();
        requestProduct lowRes = low.ProcessRequest();
        lowRes.processRequest();
        
        RequestCreator medium = new mediumPriorityCreator();
        requestProduct mediumRes = medium.ProcessRequest();
        mediumRes.processRequest();
        
        RequestCreator high = new highPriorityCreator();
        requestProduct highRes = high.ProcessRequest();
        highRes.processRequest();
    }
}
