/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Config;
import bean.Menu;
import bean.Racer;
import java.util.Scanner;
import service.MenuLoginService;
import service.MenuService;

/**
 *
 * @author NOC 1
 */
public class MenuUtil {

    public static void showMenu() {
        Menu[] menus = Menu.values();
        int selectedNumber;

        for (int i = 1; i < menus.length; i++) {
            System.out.println(menus[i].getNumber() + "." + menus[i]);
        }
        System.out.println("Yuxaridakilardan birini secin: ");
        Scanner sc = new Scanner(System.in);

        while (true) {
            selectedNumber = sc.nextInt();
            for (int i = 1; i < menus.length; i++) {
                if (selectedNumber == menus[i].getNumber()) {
                    processMenu(menus[i]);
                }
            }
            if (selectedNumber > menus.length) {
                System.out.println("Duzgun secim edin!!!");
            } else {
                break;
            }
        }

    }

    public static void createLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa login olun: ");
        System.out.println("username:");
        String user = sc.nextLine();
        System.out.println("password:");
        String pass = sc.nextLine();

        if (user.equals(user) && pass.equals(pass)) {
            processMenu(Menu.LOGIN);
            showMenu();
        } else {
            System.out.println("duzgun login edilmir");
        }

    }

    public static void processMenu(Menu menu) {
        menu.getService().process();
    }


    
    public static void showAllRacer(Racer [] r){
        for(int i = 0; i<r.length;i++){
            Racer rc = r[i];
            
            System.out.println(rc.toString());
        }
    }
    

}
