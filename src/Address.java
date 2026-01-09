import java.util.Objects;

public class Address {
    String country;
    String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country + city);
    }

    @Override
    public boolean equals(Object obj) {
        Address address = (Address) obj;
        return address.country.equals(this.country)&&address.city.equals(this.city);
    }
}
