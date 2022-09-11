package model;
import java.util.ArrayList;

    
public class Set<T> implements ISet<T> {

    
        private ArrayList<T> set;

        public Set(){
                set= new ArrayList<T>();
        }

        @Override
        public String addElement(T newElement) {

                String out="This element is already in the set";

                int pos= set.indexOf(newElement);

                if(pos==-1){
                        set.add(newElement);
                        out="The element has been added";
                        
                }
                return out;
        }

        @Override
        public String deleteElement(T newElement) {

                String out= "This element is not in the set";

                int pos=set.indexOf(newElement);

                if(pos!=-1){

                        set.remove(pos);
                        out="The element has been remove";
                }
                return out;      
        }

        @Override
        public String showElement(T newElement) {

                String out= "This element is not in the set";

                int pos=set.indexOf(newElement);  

                if (pos!=-1){
                        out="This element is in the set";
                }

                return out;
        }

        @Override
        public Set <T> union(Set <T> newSet) {

                Set <T>   union= new Set <T>();

                for(int i=0; i<set.size(); i++){

                       union.addElement(set.get(i));
                }

                for(int i=0; i<newSet.length(); i++){

                       union.addElement(newSet.getElement(i));
                }
                
                return union;
        }

        @Override
        public Set <T> intersection(Set <T> newSet) {

                Set <T>  intersection= new Set <T>();

                for(int i=0; i<set.size(); i++){

                        for(int e=0; e<newSet.length(); e++){

                                if (set.get(i).equals(newSet.getElement(e))){

                                        intersection.addElement(set.get(i));
                                }
                         }
                }
                return intersection;
        }

        @Override
        public Set <T> difference(Set <T> newSet) {

                Set <T>  difference= new Set <T>();

                for(int i=0; i<set.size(); i++){

                        difference.addElement(set.get(i));

                        for(int e=0; e<newSet.length(); e++){

                                if (set.get(i).equals(newSet.getElement(e))){

                                        difference.deleteElement(set.get(i));
                                }
                        }
                }
                return difference;
        }

        @Override
        public String toString(){

                String out="{";

                for(int i=0; i<set.size(); i++){

                        out+=" "+ set.get(i)+" ";
                }

                out+="}";

                return out;
        }

        public int length(){

                int out=0;

                for(int i=0; i<set.size(); i++){

                        out++;
                }
                return out;
        }

        public T getElement(int pos){

                T out=set.get(pos);
                return out;
        }

}

