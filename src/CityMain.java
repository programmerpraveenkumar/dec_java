public class CityMain {
        public static  void main(String args[]){
                City city1 = new City();
                city1.setName("chennai");//setter method
                city1.setPeopleCount(1000);
                System.out.println(city1.getName()+" "+city1.getPeopleCount());//getter methods

                City city2 = new City();
                city2.setName("madurai");
                city2.setPeopleCount(1500);

            System.out.println(city2.getName()+" "+city2.getPeopleCount());
        }
}
