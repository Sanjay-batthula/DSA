import java.util.*;

public class Main {
    static class Course implements Cloneable {
        private String cid;
        private String cname;
        private double cCost;
        private int noOfHrs;

        public Course(String cid, String cname, double cCost, int noOfHrs) {
            this.cid = cid;
            this.cname = cname;
            this.cCost = cCost;
            this.noOfHrs = noOfHrs;
        }

        @Override
        public String toString() {
            return "Course ID: " + cid + ", Name: " + cname +
                    ", Cost: " + cCost + ", Hours: " + noOfHrs;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        // @Override
        // public int hashCode() {
        // System.out.println("From overrided hashCode");
        // final int prime = 31;
        // int result = 1;
        // long temp;
        // temp = Double.doubleToLongBits(cCost);
        // result = prime * result + (int) (temp ^ (temp >>> 32));
        // result = prime * result + ((cid == null) ? 0 : cid.hashCode());
        // result = prime * result + ((cname == null) ? 0 : cname.hashCode());
        // result = prime * result + noOfHrs;
        // return result;
        // }

        // @Override
        // public boolean equals(Object obj) {
        // System.out.println("From overrided equals");
        // if (this == obj)
        // return true;
        // if (obj == null)
        // return false;
        // if (getClass() != obj.getClass())
        // return false;
        // Course other = (Course) obj;
        // if (Double.doubleToLongBits(cCost) != Double.doubleToLongBits(other.cCost))
        // return false;
        // if (cid == null) {
        // if (other.cid != null)
        // return false;
        // } else if (!cid.equals(other.cid))
        // return false;
        // if (cname == null) {
        // if (other.cname != null)
        // return false;
        // } else if (!cname.equals(other.cname))
        // return false;
        // if (noOfHrs != other.noOfHrs)
        // return false;
        // return true;
        // }

        protected void finalize() {
            System.out.println("finalize method");
        }
    }

    public static void main(String[] args) {
        Course c = new Course("J123", "Java", 5000, 40);
        System.out.println(c.hashCode());
        System.out.println(c.toString());
        System.out.println(c.getClass().getName());
        System.out.println(c);
        try {
            Course clonedC = (Course) c.clone();
            System.out.println(clonedC);
            if (c == clonedC) {
                System.out.println("Memory Location same");
            } else {
                System.out.println("Memory loc not same");
            }
            System.out.println(c.equals(clonedC));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Set<Course> cSet = new HashSet<>();
        cSet.add(c);
        cSet.add(new Course(null, null, 0, 0));
        cSet.add(new Course(null, null, 0, 0));
        Course c2 = c;
        cSet.add(c2);
        System.err.println(cSet.size());
        c = null;
        cSet = null;
        System.gc();

        System.out.println("End of MAIN Method");
    }
}
