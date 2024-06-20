package Polymorphism;

public class ProfileService {
    ProfileRepository repository;

    public void saveProfile(){
        repository = new ProfileDBRepository();
        repository.save();
    }
}
