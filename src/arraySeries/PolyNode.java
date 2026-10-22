package JavaDsa;

class PolyNode {
        int coeff, exp;
        PolyNode next;

        PolyNode(int c, int e) {
            coeff = c;
            exp = e;
            next = null;
        }
    }

    class Polynomial {

        // Insert node at end
        PolyNode insert(PolyNode head, int c, int e) {
            PolyNode newNode = new PolyNode(c, e);

            if (head == null)
                return newNode;

            PolyNode temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = newNode;
            return head;
        }

        // Display polynomial
        void display(PolyNode head) {
            PolyNode temp = head;
            while (temp != null) {
                System.out.print(temp.coeff + "x^" + temp.exp);
                if (temp.next != null)
                    System.out.print(" + ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Addition of two polynomials
        PolyNode add(PolyNode p1, PolyNode p2) {
            PolyNode result = null;

            while (p1 != null && p2 != null) {
                if (p1.exp == p2.exp) {
                    result = insert(result, p1.coeff + p2.coeff, p1.exp);
                    p1 = p1.next;
                    p2 = p2.next;
                } else if (p1.exp > p2.exp) {
                    result = insert(result, p1.coeff, p1.exp);
                    p1 = p1.next;
                } else {
                    result = insert(result, p2.coeff, p2.exp);
                    p2 = p2.next;
                }
            }

            while (p1 != null) {
                result = insert(result, p1.coeff, p1.exp);
                p1 = p1.next;
            }

            while (p2 != null) {
                result = insert(result, p2.coeff, p2.exp);
                p2 = p2.next;
            }

            return result;
        }

        // Subtraction (p1 - p2)
        PolyNode subtract(PolyNode p1, PolyNode p2) {
            PolyNode result = null;

            while (p1 != null && p2 != null) {
                if (p1.exp == p2.exp) {
                    result = insert(result, p1.coeff - p2.coeff, p1.exp);
                    p1 = p1.next;
                    p2 = p2.next;
                } else if (p1.exp > p2.exp) {
                    result = insert(result, p1.coeff, p1.exp);
                    p1 = p1.next;
                } else {
                    result = insert(result, -p2.coeff, p2.exp);
                    p2 = p2.next;
                }
            }

            while (p1 != null) {
                result = insert(result, p1.coeff, p1.exp);
                p1 = p1.next;
            }

            while (p2 != null) {
                result = insert(result, -p2.coeff, p2.exp);
                p2 = p2.next;
            }

            return result;
        }

        public static void main(String[] args) {
            Polynomial poly = new Polynomial();

            PolyNode p1 = null;
            p1 = poly.insert(p1, 5, 2);
            p1 = poly.insert(p1, 3, 1);

            PolyNode p2 = null;
            p2 = poly.insert(p2, 4, 2);
            p2 = poly.insert(p2, 2, 1);

            System.out.print("JavaInterviewQuetions.Polynomial 1: ");
            poly.display(p1);

            System.out.print("JavaInterviewQuetions.Polynomial 2: ");
            poly.display(p2);

            PolyNode sum = poly.add(p1, p2);
            System.out.print("Addition: ");
            poly.display(sum);

            PolyNode diff = poly.subtract(p1, p2);
            System.out.print("Subtraction: ");
            poly.display(diff);
        }
    }

