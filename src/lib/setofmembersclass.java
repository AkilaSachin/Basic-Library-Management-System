/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Akila Jayasinghe
 */
public class setofmembersclass implements Serializable{
    
        private ArrayList<memberclass> members;
    
        public void addMember(memberclass aMember) {
            members.add(aMember);

         }
        
        public setofmembersclass(){
            members= new ArrayList<>();
        }
        
        memberclass getMemberFromName(String memname){
            for(memberclass member:members){
                if(memname.equals(member.getmembername())){
                    return member;
                }
            }
                        return null;
        }
        
         memberclass getMemberFromNumber(int memnum){
            for(memberclass member:members){
                if(memnum == member.getmemnum()){
                    return member;
                }
            }
                        return null;
                        
        }
         
        public memberclass[] getallmembers(){
            return members.toArray(new memberclass[0]);
        } 
         
         void removeMember(memberclass mem){
             members.remove(mem);
         }
}
