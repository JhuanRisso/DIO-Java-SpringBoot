package Desafios.Bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(80);
    private Set<Devs> subscribedDevs = new HashSet<>();
    private Set<Contents> content = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descrition) {
        this.description = descrition;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Devs> getSubscribedDevs() {
        return subscribedDevs;
    }

    public void subscribedDevs(Set<Devs> subscribedDevs) {
        this.subscribedDevs = subscribedDevs;
    }

    public Set<Contents> getContent() {
        return content;
    }

    public void setContent(Set<Contents> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initialDate, bootcamp.initialDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(subscribedDevs, bootcamp.subscribedDevs) && Objects.equals(content, bootcamp.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initialDate, finalDate, subscribedDevs, content);
    }

}