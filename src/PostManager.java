import java.util.*;

public class PostManager {


    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) return 0;

        int total = 0;
        for (int i : interactions) {
            total += i;
        }
        return total;
    }


    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        else if (engagementScore >= 500) return "Popular";
        else if (engagementScore >= 100) return "Good";
        else if (engagementScore >= 50) return "Low";
        else return "Poor";
    }


    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }


    public ArrayList<String> manageHashtags(String[] hashtags) {
        Set<String> uniqueSet = new HashSet<>();
        for (int i = 0; i < Math.min(hashtags.length, 5); i++) {
            uniqueSet.add(hashtags[i]);
        }
        return new ArrayList<>(uniqueSet);
    }


    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        for (String post : posts) {
            if (postEngagement.containsKey(post) && postEngagement.get(post) > 500) {
                trending.add(post);
            }
        }
        return trending;
    }


    public HashSet<String> getUniqueAuthors(String... authors) {
        return new HashSet<>(Arrays.asList(authors));
    }


    public static void main(String[] args) {
        PostManager manager = new PostManager();

        String postTitle = "Java Programming Tips";
        int engagement = manager.calculateEngagement(150, 75, 25);
        String category = manager.getCategoryRating(engagement);

        String[] hashtags = { "#java", "#coding", "#programming", "#java", "#tips" };
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);

        ArrayList<String> posts = new ArrayList<>(Arrays.asList(
                "Java Programming Tips",
                "Advanced Java Tutorial",
                "Spring Boot Guide"
        ));

        HashMap<String, Integer> engagements = new HashMap<>();
        engagements.put("Java Programming Tips", 250);
        engagements.put("Advanced Java Tutorial", 700);
        engagements.put("Spring Boot Guide", 1200);

        LinkedList<String> trendingPosts = manager.findTrendingPosts(posts, engagements);

        HashSet<String> uniqueAuthors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");


        System.out.println("\n=== Social Media Post Manager ===");
        manager.displayPostStats(postTitle, engagement, category);

        System.out.println("\nUnique Hashtags: " + uniqueHashtags);
        System.out.println("Trending Posts: " + trendingPosts);
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
