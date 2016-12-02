package fr.utbm.main;

import fr.utbm.controller.DefaultLocationController;

public class AppGetLocation {

	public static void main(String[] args) {
            // TODO Auto-generated method stub
            DefaultLocationController defLocationController=new DefaultLocationController();
            System.out.println(defLocationController.getLocation(1).getCity());
	}

}
