package Service45;

import java.time.LocalDate;

import Entities45.Contract;
import Entities45.Installment;

public class ContractService{

    private OnlinePaymantService onlinePaymantService;// lembrar que ele depende do onlinePaymant

    public  ContractService(OnlinePaymantService onlinePaymantService) {
        this.onlinePaymantService = onlinePaymantService;
        }
        
        public  void ProcessContract(Contract contract,  int month) {
           
            double basicQuota = contract.getTotalvalue()/ month;
            for (int i=1; i<=month; i++){
                LocalDate date = contract.getDate().plusMonths(i);
                double interest = onlinePaymantService.interest(basicQuota,i);
                double fee = onlinePaymantService.paymantFee(basicQuota + interest);

                double quota = basicQuota + interest + fee;

                contract.getintallment().add( new Installment(date, quota));

            }






        }

    
   
    


    
}
