/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcarlos.backendjavajson;

public class Category{
    private int category_id;
    private String name;
    private String nicename;

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNicename() {
        return nicename;
    }

    public void setNicename(String nicename) {
        this.nicename = nicename;
    }

    @Override
    public String toString() {
        return "Category{" + "category_id=" + category_id + ", name=" + name + ", nicename=" + nicename + '}';
    }
    
}
