public class CityMain2 {
        public static  void main(String args[]){
                City city1 = new City();
                city1.setName("chennai");//setter method
                city1.setPeopleCount(1000);


                City city2 = new City();
                city2.setName("madurai");
                city2.setPeopleCount(1500);

                City city3 = new City();
                city3.setName("banglore");
                city3.setPeopleCount(2500);

                City[] city  = {city1,city2,city3};

                for(int i = 0;i<city.length;i++){
                        City c = city[i];
                        System.out.println(c.getName()+" -- "+c.getPeopleCount());
                }
        }
}
