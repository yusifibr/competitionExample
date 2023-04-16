/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import bean.Config;
import bean.Racer;
import java.util.Scanner;
import util.MenuUtil;

/**
 *
 * @author NOC 1
 */
public class MenuRegisterService implements MenuRegisterServiceInter {

    @Override
    public void process() {
        String name, surname;
        Racer rc = new Racer();
        System.out.println("Neche nefer yarishacaq?");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        Config.r = new Racer[numb];

        for (int i = 0; i < numb; i++) {
            System.out.println(i + 1 + ". shexsin melumatlari:");
            
            sc = new Scanner(System.in);
            name = sc.nextLine();
            rc.setName(name);
            
            sc = new Scanner(System.in);
            surname = sc.nextLine();
            rc.setSurname(surname);
            
            
            Config.r[i] = rc;
            
        }

        MenuUtil.showAllRacer(Config.r);

    }

}
