/**
 * @param {string} s
 * @param {string} p
 * @return {number[]}
 */
 var findAnagrams = function(s, p) {
    let output=[]
    let hashP={}
    for (let h=0; h< p.length; h++){
        if (hashP.hasOwnProperty(p[h])){
            hashP[p[h]]+=1
        }
    else{
        hashP[p[h]]=1
    }
    }
  for (let i=0; i<=(s.length-p.length); i++) {
      let hashP1= {...hashP}
      for (let j=i; j<p.length+i; j++){
          if (hashP1.hasOwnProperty(s[j])){
              hashP1[s[j]] -=1
          }
      } 
      let boolean = true 
      Object.values(hashP1).forEach(val =>{
            if (val!=0){
              boolean = false 
          }})
      if(boolean === true){
          output.push(i)          
      }
      } 
    return output
};