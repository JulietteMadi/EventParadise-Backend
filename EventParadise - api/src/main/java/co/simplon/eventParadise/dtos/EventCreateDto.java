package co.simplon.eventParadise.dtos;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EventCreateDto {

    @NotEmpty
    private String name;

    @NotNull
    private LocalDateTime date;

    private Long locationId;

    private Long topicId;

    @NotNull
    private Float price;

    @NotEmpty
    private String description;

    public EventCreateDto() {
	// TODO Auto-generated constructor stub
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public LocalDateTime getDate() {
	return date;
    }

    public void setDate(LocalDateTime date) {
	this.date = date;
    }

    public Long getLocationId() {
	return locationId;
    }

    public void setLocationId(Long locationId) {
	this.locationId = locationId;
    }

    public Long getTopicId() {
	return topicId;
    }

    public void setTopicId(Long topicId) {
	this.topicId = topicId;
    }

    public Float getPrice() {
	return price;
    }

    public void setPrice(Float price) {
	this.price = price;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    @Override
    public String toString() {
	return "{name=" + name + ", date=" + date
		+ ", locationId=" + locationId
		+ ", topicId=" + topicId + ", price="
		+ price + ", description=" + description
		+ "}";
    }

}
