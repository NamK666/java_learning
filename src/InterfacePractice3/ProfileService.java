package InterfacePractice3;

public class ProfileService {
    ProfileRepository repository;

    public void saveProfile(){
        repository = new ProfileDBRepository();
        repository.save();
    }
}
