package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero buzzer =  new Hero(200, 85, " Лечить героев " );
        System.out.println(buzzer.getHealth() + " " +
                buzzer.getDamage() +  " " + buzzer.getSuperPowers() );

        Hero kripton = new Hero(200, 85);
        System.out.println(kripton.getHealth() + " " + kripton.getDamage());


        Boss painKiller = new Boss();
        painKiller.setBossHealth(205);
        painKiller.setBossDamage(100);
        painKiller.setTypeOfProtection("Evasion");

        System.out.println(" Здоровье Босса: " + painKiller.getBossHealth() +
                " \n Урон Босса " + painKiller.getBossDamage() +
                " \n Тип защиты Босса " + painKiller.getTypeOfProtection());
    }

}
