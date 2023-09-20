public class Navigator {
    private INavigationStrategy navigation;
    public Navigator(INavigationStrategy _navigation){
        this.navigation=_navigation;
    }

    public double navigation(String from , String to){
        return this.navigation.navigate(from,to);
    }
}
