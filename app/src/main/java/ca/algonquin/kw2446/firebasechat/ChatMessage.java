package ca.algonquin.kw2446.firebasechat;


public class ChatMessage {

    private String id;          // DB에 저장할 ID
    private String text;        // 메시지
    private String name;        // 이름
    private String email;       // email

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String photoUrl;    // 프로필 사진 경로
    private String imageUrl;    // 첨부 이미지 경로

    public ChatMessage() {
    }

    public ChatMessage(String text, String name, String email,String photoUrl, String imageUrl) {
        this.text = text;
        this.name = name;
        this.email=email;
        this.photoUrl = photoUrl;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

