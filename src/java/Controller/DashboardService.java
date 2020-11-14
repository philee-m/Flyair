/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Domain.AccountStatus;
import Domain.Category;
import Domain.FlightBookingStatus;
import Domain.Gender;
import Domain.IdentificationType;
import Domain.Post;

/**
 *
 * @author Philip
 */
public class DashboardService {
    
  private Gender [] genderList = Gender.values();
  private Post [] postlist = Post.values();
  private Category [] categorylist = Category.values();
  private FlightBookingStatus [] flightstatuslist = FlightBookingStatus.values();
  private AccountStatus [] accountstatuslist = AccountStatus.values();
  private IdentificationType [] identificationType = IdentificationType.values();

    public Gender[] getGenderList() {
        return genderList;
    }

    public FlightBookingStatus[] getFlightstatuslist() {
        return flightstatuslist;
    }

    public void setFlightstatuslist(FlightBookingStatus[] flightstatuslist) {
        this.flightstatuslist = flightstatuslist;
    }

    public void setGenderList(Gender[] genderList) {
        this.genderList = genderList;
    }

    public Post[] getPostlist() {
        return postlist;
    }

    public void setPostlist(Post[] postlist) {
        this.postlist = postlist;
    }

    public Category[] getCategorylist() {
        return categorylist;
    }

    public void setCategorylist(Category[] categorylist) {
        this.categorylist = categorylist;
    }

    public AccountStatus[] getAccountstatuslist() {
        return accountstatuslist;
    }

    public void setAccountstatuslist(AccountStatus[] accountstatuslist) {
        this.accountstatuslist = accountstatuslist;
    }

    public IdentificationType[] getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(IdentificationType[] identificationType) {
        this.identificationType = identificationType;
    }
    
    
    
    
}
