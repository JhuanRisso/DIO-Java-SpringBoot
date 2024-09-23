package Desafios.Bootcamp;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Devs {
    
    private String name;
    private Set<Contents> subscribedContent = new LinkedHashSet<>();
    private Set<Contents> finishedContent = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContent());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress() {
        Optional<Contents> content = this.subscribedContent.stream().findFirst();
        if(content.isPresent()) {
            this.finishedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        } else {
            System.err.println("You're not in any courses!");
        }
    }

    public double calculateTotalXp() {
        Iterator<Contents> iterator = this.subscribedContent.iterator();
        double sum = Contents.DefaultXp;
        while(iterator.hasNext()){
            double next = iterator.next().calculateXp();
            sum += next;
        }
        return sum;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Contents> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Contents> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Contents> getFinishedContent() {
        return finishedContent;
    }

    public void setFinishedContent(Set<Contents> finishedContent) {
        this.finishedContent = finishedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(name, devs.name) && Objects.equals(finishedContent, devs.subscribedContent) && Objects.equals(finishedContent, devs.finishedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, finishedContent);
    }

}
