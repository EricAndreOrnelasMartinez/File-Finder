n=1
while [ $n -le 15 ] 
do 
cd ..
n=$((n + 1))
done
pwd
mkdir fileFinder
ls > /fileFinder/mff.txt
while IFS= read -r line
do 
cd $line 
ls > /fileFinder/$line.txt
cd ..
cd fileFinder
mkdir $line
cd ..
done < /fileFinder/mff.txt
n34=1
serial=0
lista[0]=2
while IFS= read -r line
do 
serial=$((serial + 1))
done < /fileFinder/mff.txt
echo "---------------------"
echo "---------------------"
unset "${lista[0]}"