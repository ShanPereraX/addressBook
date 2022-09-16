/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.ijse.addressbook.database;

import java.util.ArrayList;
import lk.ijse.addressbook.model.CustomerDTO;

/**
 *
 * @author lakshan
 */
public class DataBase {
    private ArrayList<CustomerDTO> list;

    public DataBase() {
        list = new ArrayList<>();
    }

    /**
     * @return the list
     */
    public ArrayList<CustomerDTO> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<CustomerDTO> list) {
        this.list = list;
    }


}
