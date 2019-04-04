package dev.dreamsource.soundcast.data.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "objectId",
        "createdAt",
        "updatedAt",
        "title",
        "link",
        "thumbnail",
        "music_file",
        "thumbnail_file"
})
public class AudioTrack {

    @JsonProperty("objectId")
    private String objectId;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("title")
    private String title;
    @JsonProperty("link")
    private String link;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("music_file")
    private MusicFile musicFile;
    @JsonProperty("thumbnail_file")
    private ThumbnailFile thumbnailFile;

    @JsonProperty("objectId")
    public String getObjectId() {
        return objectId;
    }

    @JsonProperty("objectId")
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("music_file")
    public MusicFile getMusicFile() {
        return musicFile;
    }

    @JsonProperty("music_file")
    public void setMusicFile(MusicFile musicFile) {
        this.musicFile = musicFile;
    }

    @JsonProperty("thumbnail_file")
    public ThumbnailFile getThumbnailFile() {
        return thumbnailFile;
    }

    @JsonProperty("thumbnail_file")
    public void setThumbnailFile(ThumbnailFile thumbnailFile) {
        this.thumbnailFile = thumbnailFile;
    }

}
