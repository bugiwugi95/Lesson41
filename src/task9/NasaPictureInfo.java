public class NasaPictureInfo {
   public String title;
    public String date;
    public String explanation;
    public String url;

    public String mediaType;

    NasaPictureInfo(String title,String date,String explanation,String url,String mediaType){
        this.title = title;
        this.date = date;
        this.explanation = explanation;
        this.url = url;
        this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        return this.mediaType + ":" + this.title +"(" + this.date + ")" ;
    }
}
