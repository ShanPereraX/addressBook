
package lk.ijse.addressbook.main;

import java.util.ArrayList;
import lk.ijse.addressbook.database.DataBase;
import lk.ijse.addressbook.view.*;

/*
 * @author lakshan
 */
public class AppInitializer {
    public static void main(String[] args) {
        new MainForm(new DataBase(),"Address Book").setVisible(true);
    }

}
