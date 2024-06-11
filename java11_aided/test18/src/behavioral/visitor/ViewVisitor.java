package behavioral.visitor;

public class ViewVisitor extends Visitor {
    private String Path = "";

    public void visit(File file) {
        System.out.println(Path + "/" + file.name);
    }

    public void visit(Directory dic) {
        Path = Path + "/" + dic.name;
        System.out.println(Path);
        for (int i = 0; i < dic.directory.size(); i++) {
            dic.directory.get(i).accept(this);
        }
    }
}
