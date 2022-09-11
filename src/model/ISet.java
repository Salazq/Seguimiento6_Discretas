package model;

public interface ISet<T> {

    public String addElement(T newElement);
    public String deleteElement(T newElement);
    public String showElement(T newElement);  
    public Set <T> union(Set <T> newSet);  
    public Set <T> intersection(Set <T> newSet);
    public Set <T> difference(Set <T> newSet);

}
