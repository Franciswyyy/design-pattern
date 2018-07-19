package Proxy01;

public class Main {

    public static void main(String[] args) {
        driver();
      }

    public static void driver(){
        PersonBean joe = new PersonImpl("joe","man","woman",60,10);
        PersonBean owner = getProxy.getOwnerProxy(joe);
        System.out.println("name:" + owner.getName());
        owner.setInterests("pao niu");
        System.out.println("interests:" + owner.getInterests());


        try {
            owner.setHotOrNotRating(10);
        }catch (Exception e){
            System.out.println("can't set rating from owner proxy");
        }

        System.out.println("rating: " + owner.getHotOrNotRating());

        System.out.println("--------分界-----------");

        PersonBean nonOwner = getProxy.getNonOwnerProxy(joe);
        System.out.println("name:" + nonOwner.getName());
        nonOwner.setHotOrNotRating(-10);
        System.out.println("rating: " + nonOwner.getHotOrNotRating());

        try {
            nonOwner.setInterests("playing ppp");
            System.out.println("test");
        }catch (Exception e){
            System.out.println("can't set interest from non Owner proxy");
        }
        System.out.println("interest：" + nonOwner.getInterests());
     }
}
