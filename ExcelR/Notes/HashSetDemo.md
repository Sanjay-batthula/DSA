import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetDemo {

    public static void main(String[] args) {
        System.out.println("I AM From Main Method: " + Thread.currentThread().getName());

        Resource resource = new Resource(1, "Sanjay", "Guest@123", "Student");
        Class<?> className = resource.getClass();

        System.out.println(className);
        System.out.println(className.getName());
        System.out.println(resource.hashCode());
        System.out.println(className.getName() + "@" + Integer.toHexString(resource.hashCode()));
        System.out.println(resource);

        Resource resource1 = new Resource(1, "Sanjay", "Guest@123", "Student");
        System.out.println(resource1);

        if (resource == resource1) {
            System.out.println("Memory Locations Are Equal");
        } else {
            System.out.println("Not Equal");
        }

        boolean result = resource.equals(resource1);
        System.out.println("Equal content? " + result);

        Resource resource2 = new Resource(2, "def", "Guest@123", "Student");
        Resource resource3 = new Resource(3, "abc", "Guest@123", "Student");

        Set<Resource> resources = new HashSet<>();
        resources.add(resource);
        resources.add(resource1);
        resources.add(resource2);
        resources.add(resource3);

        System.out.println("HashSet size: " + resources.size());
        System.out.println("HashSet contents:");
        for (Resource res : resources) {
            System.out.println(res);
        }

        SortedSet<Resource> resourcesSorted = new TreeSet<>();
        resourcesSorted.add(resource);
        resourcesSorted.add(resource1);
        resourcesSorted.add(resource2);
        resourcesSorted.add(resource3);

        System.out.println("\nTreeSet size (sorted by name): " + resourcesSorted.size());
        System.out.println("TreeSet contents:");
        for (Resource res : resourcesSorted) {
            System.out.println(res);
        }

        // Cleanup
        resource = null;
        resource1 = null;
        resource2 = null;
        resource3 = null;
        resources = null;
        resourcesSorted = null;

        System.gc(); // Invoking Garbage Collector

        System.out.println("I am From End Of Main Method: " + Thread.currentThread().getName());
    }
}



```
public class Resource implements Cloneable, Comparable<Resource> {

    private int resourceId;
    private String resourceName;
    private String pwd;
    private String designation;

    // Constructor
    public Resource(int resourceId, String resourceName, String pwd, String designation) {
        super();
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.pwd = pwd;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Resource [resourceId=" + resourceId +
                ", resourceName=" + resourceName +
                ", pwd=" + pwd +
                ", designation=" + designation + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("Overridden hashCode()");
        final int prime = 31;
        int result = 1;
        result = prime * result + ((designation == null) ? 0 : designation.hashCode());
        result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
        result = prime * result + resourceId;
        result = prime * result + ((resourceName == null) ? 0 : resourceName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Overridden equals() method");

        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Resource other = (Resource) obj;

        if (resourceId != other.resourceId)
            return false;
        if (resourceName == null) {
            if (other.resourceName != null)
                return false;
        } else if (!resourceName.equals(other.resourceName))
            return false;

        if (pwd == null) {
            if (other.pwd != null)
                return false;
        } else if (!pwd.equals(other.pwd))
            return false;

        if (designation == null) {
            if (other.designation != null)
                return false;
        } else if (!designation.equals(other.designation))
            return false;

        return true;
    }

    @Override
    public int compareTo(Resource o) {
        System.out.println("Comparable method");
        return this.resourceName.compareTo(o.resourceName);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void finalize() {
        System.out.println("From finalize Method:" + Thread.currentThread().getName());
    }
}
```