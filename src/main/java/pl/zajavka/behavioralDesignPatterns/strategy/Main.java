package pl.zajavka.behavioralDesignPatterns.strategy;

public class Main {
    public static void main(String[] args) {
        // Strategy
        // jako klient metody chcemy zdecydowac jaki algorytm bedzie wywolany w srodku tej metody
        // komparator w Collection.sort() to przyklad wzorca strategi
        // Policy pattern
        // przykladowo klient wybiera sposob dostawy w sklepie - klient decyduje o strategi

        OnlineStore onlineStore = new OnlineStore();

        onlineStore.addParcel(new Parcel("Skarpety"));
        onlineStore.addParcel(new Parcel("mleko"));
        onlineStore.addParcel(new Parcel("monitory"));

        System.out.println("##Courier");
        onlineStore.deliver(parcel -> System.out.printf("Parcel %s delivered by Courier%s", parcel.getName()));
        System.out.println("##Post");
        onlineStore.deliver(parcel -> System.out.printf("Parcel %s delivered by Post%s", parcel.getName()));
        System.out.println("##ParcelLocker");
        onlineStore.deliver(parcel -> System.out.printf("Parcel %s delivered by ParcelLocker%s", parcel.getName()));
    }
}
