package homeworks.homework2;

public class TV {
    private Integer diagonal;
    private String screen_resolution;
    private String TV_matrix;
    private String Smart_TV;
    private Integer channel;
    private Integer TV_volume;
    private Boolean TV_ON;

    public TV(String Smart_TV, String TV_matrix, String screen_resolution, Integer diagonal, Integer channel, Integer TV_volume, Boolean TV_ON) {
        this.diagonal = diagonal;
        this.screen_resolution = screen_resolution;
        this.Smart_TV = Smart_TV;
        this.TV_matrix = TV_matrix;
        this.channel = channel;
        this.TV_volume = TV_volume;
        this.TV_ON = TV_ON;
    }


    @Override
    public String toString() {
        return "TV{" +
                "diagonal=" + diagonal +
                ", screen_resolution='" + screen_resolution + '\'' +
                ", TV_matrix='" + TV_matrix + '\'' +
                ", Smart_TV='" + Smart_TV + '\'' +
                ", channel=" + channel +
                ", TV_volume=" + TV_volume +
                ", TV_ON=" + TV_ON +
                '}';
    }

    public TV() {
        this.diagonal = 75;
        this.screen_resolution = "2K";
        this.Smart_TV = "NO";
        this.TV_matrix = "Direct LED";
        this.channel = 2;
        this.TV_ON = true;
        this.TV_volume = 75;


    }



    public Integer getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Integer diagonal) {
        this.diagonal = diagonal;
    }

    public String getScreen_resolution() {
        return screen_resolution;
    }

    public void setScreen_resolution(String screen_resolution) {
        this.screen_resolution = screen_resolution;
    }

    public String getTV_matrix() {
        return TV_matrix;
    }

    public void setTV_matrix(String TV_matrix) {
        this.TV_matrix = TV_matrix;
    }

    public String getSmart_TV() {
        return Smart_TV;
    }

    public void setSmart_TV(String smart_TV) {
        Smart_TV = smart_TV;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getTV_volume() {
        return TV_volume;
    }

    public void setTV_volume(Integer TV_volume) {
        this.TV_volume = TV_volume;
    }

    public Boolean getTV_ON() {
        return TV_ON;
    }

    public void setTV_ON(Boolean TV_ON) {
        this.TV_ON = TV_ON;
    }
}




