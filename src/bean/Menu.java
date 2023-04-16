/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import service.MenuExitService;
import service.MenuLoginService;
import service.MenuRegisterService;
import service.MenuService;
import service.MenuStartService;

/**
 *
 * @author NOC 1
 */
public enum Menu implements MenuService{
    LOGIN(0, "login", new MenuLoginService()),
    REGISTER(1, "Yarsimacilari register et", new MenuRegisterService()),
    START(2, "Yarisha bashla", new MenuStartService()),
    LOGOUT(3, "logout", null),
    EXIT(4, "exit", new MenuExitService());

    private String label;
    private MenuService service;
    private int number;

    Menu(int number, String label, MenuService menu) {
        this.number = number;
        this.label = label;
        this.service = menu;
    }

    public String getLabel() {
        return label;
    }

    public int getNumber() {
        return number;
    }

    public MenuService getService() {
        return service;
    }

    @Override
    public void process() {
    }

}
