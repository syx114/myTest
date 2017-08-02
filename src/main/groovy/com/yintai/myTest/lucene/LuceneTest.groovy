package com.yintai.myTest.lucene

import groovy.transform.CompileStatic
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.analysis.standard.StandardAnalyzer
import org.apache.lucene.document.Document
import org.apache.lucene.document.Field
import org.apache.lucene.document.StringField
import org.apache.lucene.index.DirectoryReader
import org.apache.lucene.index.IndexReader
import org.apache.lucene.index.IndexWriter
import org.apache.lucene.index.IndexWriterConfig
import org.apache.lucene.index.Term
import org.apache.lucene.search.IndexSearcher
import org.apache.lucene.search.Query
import org.apache.lucene.search.TermQuery
import org.apache.lucene.search.TopDocs
import org.apache.lucene.store.Directory
import org.apache.lucene.store.FSDirectory
import org.springframework.stereotype.Component

import java.nio.file.FileSystem
import java.nio.file.FileSystems
import java.nio.file.Path

/**
 * Created by syx11 on 2017/4/3.
 */
@Component
@CompileStatic
class LuceneTest {
    void testin(){
//        Directory directory = FSDirectory.open(new File("D:\\lucene\\index") as Path)
        Directory directory = FSDirectory.open(FileSystems.getDefault().getPath("D:\\lucene\\index)"))
        Analyzer analyzer = new StandardAnalyzer()

        IndexWriterConfig indexWriterConfig = new IndexWriterConfig(analyzer)
        IndexWriter indexWriter = new IndexWriter(directory,indexWriterConfig)

        Document document = new Document()

        StringField stringField = new StringField("cid","1231",Field.Store.YES)
        StringField stringField1 = new StringField("pid","1234",Field.Store.YES)
        StringField stringField2 = new StringField("vid","131",Field.Store.YES)

        document.add(stringField)
        document.add(stringField2)
        document.add(stringField1)

        indexWriter.addDocument(document)
        indexWriter.close()
    }

    void testout(){
        Directory directory = FSDirectory.open(FileSystems.getDefault().getPath("D:\\lucene\\index)"))
        IndexReader indexReader = DirectoryReader.open(directory)
        IndexSearcher indexSearcher = new IndexSearcher(indexReader)

        Query query = new TermQuery(new Term("vid","131"))
        TopDocs topDocs = indexSearcher.search(query,10)
        int count = topDocs.totalHits

        println(count)
    }

}
