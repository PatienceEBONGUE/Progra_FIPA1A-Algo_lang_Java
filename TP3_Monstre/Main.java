class Main {
  static int nb_monster = 0;
  public static void main(String[] args){
    Army army = createArmy() ;
    for (int i=0; i<8; i++) {
      //displayMonster();
      nb_monster += i;
      addMonster(army, createMonster("Pikachu"+i, 0));

    }
    System.out.println(nb_monster);
    displayArmy(army);

  }

  static Monster createMonster (String name, int health) {
    Monster aMonster = new Monster();
    aMonster.name = name;
    aMonster.health = health;

    return aMonster;
    //System.out.println(aMonster);
    //System.out.println(aMonster.health);
  }

  static void displayMonster(Monster monster) {
    System.out.println("Monster"+"<"+monster.name+">");
  }

  static Army createArmy() {
    Army arm = new Army();
    arm.monsters = new Monster[100];
    arm.top = 0;

    return arm;
  }

  static void addMonster (Army army, Monster monster) {

      if (army.top > army.monsters.length) {
        Monster[] tmp = new Monster[nb_monster*2];
        for (int i =0; i<nb_monster; i++) {
          tmp[i] = army.monsters[i] ;
        }
      army.monsters = tmp;
      }
      army.monsters[army.top] = monster;
      army.top+=1;



 }

  static void displayArmy (Army army) {
    for (int i = 0; i<army.top; i++) {
      displayMonster(army.monsters[i]);
    }

  }

}
