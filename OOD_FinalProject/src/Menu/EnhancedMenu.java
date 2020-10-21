package Menu;
import java.util.ArrayList;
import java.util.Iterator;

public class EnhancedMenu extends MenuComponent {
    Iterator iterator = null;

    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Iterator createIterator() {
        if(iterator == null){
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }

    public EnhancedMenu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return getDescription();
    }

    @Override
    public void print() {
        System.out.print("\n " + getName());
        System.out.println("\n " + getDescription());
        System.out.println("-----------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

}