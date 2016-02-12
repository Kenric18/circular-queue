public class QueueTest {

   public static void main(String[] args) {

    int max = 15;

    CircularQueue q = new CircularQueue (max);

    System.out.println ("Add:");
    for (int l = 0; l < max; ++l) {
      q.put (l+1);
    }
    q.print ();

    try {

      System.out.println ("Get:");
      for (int l = 0; l < max; ++l) {
        System.out.println ("Get " + l + ": " + q.get ());
      }

      System.out.println ("Add/Get:");
      int l = 1;
      q.put (l++);
      q.put (l++);
      while (!q.empty () && q.length () < 1000) {
        q.put (l++);
        if (l % 2 == 0) {
          q.put (l++);
          q.put (l++);
        } else {
          System.out.println ("Get " + q.length () + ": " + q.get ());
        }
        System.out.println ("Get " + q.length () + ": " + q.get ());
      }

      while (!q.empty ()) {
        System.out.println ("Get " + q.length () + ": " + q.get ());
      }

      System.out.println ("Get " + q.length () + ": " + q.get ());

    } catch (RuntimeException e) {
      System.out.println ("Runtime exception: " + e.getMessage ());
    }
    return;
  }

}
