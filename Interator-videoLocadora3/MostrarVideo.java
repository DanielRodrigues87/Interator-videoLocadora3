public class MostrarVideo {

    public static void main(String[] args) {
        VideoItem[] videoItens = new VideoItem[5];
        videoItens[0] = new VideoItem("Batman", 2.5);
        videoItens[1] = new VideoItem("Samaritano", 1.5);
        videoItens[2] = new VideoItem("Stalonne Cobra", 1.5);
        videoItens[3] = new VideoItem("Touro Indomável", 2.5);
        videoItens[4] = new VideoItem("Scarface", 2.5);

        Iterator videoIterator = new VideoIterator(videoItens);

        while (videoIterator.hasNext()) {
            VideoItem videoItem = (VideoItem)videoIterator.next();
            System.out.println(videoItem.nome + " =R$" + videoItem.preco);
        }
    }
    
}
