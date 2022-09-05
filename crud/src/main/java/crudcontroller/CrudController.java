package crudcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yaml.snakeyaml.events.Event.ID;

import com.crud.project.crud.model.GuruEntity;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;



@Controller
@RequestMapping("/")
public class CrudController {

    @Autowired
    GuruService service;

        @RequestMapping
        public String getAllGuru (Model model)
        {
            System.out.println("getAllGuru");
            List<GuruEntity> list = service.getAllGuru();

            model.addAttribute("Guru", list);

            return "list-guru";
        }
}

@RequestMapping(path = {"/edit", "/edit/{id}"})
    public String editGuruId(Model model, @PathVariable("Id") Optional <long> id)
            throws RecordNotFoundException
            {
                String id;
                System.out.println("editGuruById"+id);
                if(Id.isPresent()) {
                    GuruEntity entity = service.GetGuruById(Id.get());
                    model.addAttribute("Guru", entity);
                }else{
                    model.addAttribute("Guru", new GuruEntity());
                }

                return "add-edit-guru";
            }

            @RequestMapping(path = "delete/{id}")
            public String deletGuruById(Model model, @PathVariable("id")long id)
                throws RecordNotFoundException
                {
                    System.out.println("deletGuruById"+id);

                    service.deletGuruById(id);
                    return "Redirect:/";
                }

                @RequestMapping(path = "createGuru", method = Requestmetod.POST)
            public String createOrUpdateGuru(GuruEntity guru)
                throws RecordNotFoundException
                {
                    System.out.println("createOrUpdateGuru");

                    return "Redirect:/";
                }
            }